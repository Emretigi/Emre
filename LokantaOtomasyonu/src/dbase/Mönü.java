package dbase;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;

public class Mönü extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	
	DefaultTableModel modelim = new DefaultTableModel();
	
	Object[] kolonlar = {"ürünler","fiyat"};
	Object[] satirlar = new Object[2];
	List<String> sepet =new ArrayList<String>();
	int toplamSepetTutari = 0;
    

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mönü frame = new Mönü();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Mönü() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 501);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 400, 443);
		contentPane.add(scrollPane);
		
		table = new JTable();
		modelim.setColumnIdentifiers(kolonlar);
		table.setBounds(390, 147, 36, 50);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("Mönüyü gör");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResultSet myRs = baglanti.yap();
				modelim.addRow(satirlar);
				try {
					while(myRs.next()) {
						satirlar[0] = myRs.getString("urunler_isim");
						satirlar[1] = myRs.getString("fiyat");
						modelim.addRow(satirlar);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				table.setModel(modelim);
				
			}
		});
		btnNewButton.setBounds(413, 10, 112, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sepete ekle");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String urun = table.getModel().getValueAt(table.getSelectedRow(), 0).toString();
					sepet.add(urun);
					String fiyat = table.getModel().getValueAt(table.getSelectedRow(), 1).toString();
					String parts[] = fiyat.split(" ");
					toplamSepetTutari += Integer.valueOf(parts[0]);
				} catch (Exception e1) {
					
				}
			}
		});
		btnNewButton_1.setBounds(420, 418, 105, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Sipariş oluştur");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Siparişiniz oluşturuldu");
				System.out.println(Arrays.toString(sepet.toArray()));
				System.out.println(toplamSepetTutari +" TL");
			}
		});
		btnNewButton_2.setBounds(548, 418, 128, 35);
		contentPane.add(btnNewButton_2);
	    
	}
}
