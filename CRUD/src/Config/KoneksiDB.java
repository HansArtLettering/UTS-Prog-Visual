package Config;

    import java.sql.Connection;
    import java.sql.*;
    import javax.swing.JOptionPane;

public class KoneksiDB {
        
        private static Connection conn;
        public static Connection getKoneksi() {
            try {
            //untuk menentukan driver DB
            Class.forName("com.mysql.cj.jdbc.Driver");
            //untuk membuat koneksi dari DB ke driver
            String url = "jdbc:mysql://localhost:3306/data_mahasiswa";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
            //pesan jika koneksi berhasil
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        } catch (Exception e) {
            //pesan jika koneksi gagal
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
        }
 return conn;
 }
}
