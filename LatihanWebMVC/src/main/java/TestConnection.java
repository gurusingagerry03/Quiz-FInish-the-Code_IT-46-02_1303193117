/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        // Konfigurasi koneksi database
        String url = "jdbc:mysql://localhost:3306/jdbc_latihan"; // Ganti nama database jika perlu
        String user = "root"; // Username database Anda
        String password = ""; // Password database Anda

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null) {
                System.out.println("Koneksi ke database berhasil!");
            }
        } catch (SQLException e) {
            System.out.println("Koneksi ke database gagal!");
            e.printStackTrace();
        }
    }
}

