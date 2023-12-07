package com.example.praktikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Tabel extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Muhammad Qohary Rawidafany");
        TableView tabel = new TableView();
        TableColumn<Mahasiswa, String>kolom1 = new TableColumn<>("ID");
        kolom1.setCellValueFactory(
                new PropertyValueFactory<>("id"));
        TableColumn<Mahasiswa, String>kolom2 = new TableColumn<>("NAMA");
        kolom2.setCellValueFactory(
                new PropertyValueFactory<>("nama"));
        TableColumn<Mahasiswa, String>kolom3 = new TableColumn<>("NIM");
        kolom3.setCellValueFactory(
                new PropertyValueFactory<>("nim"));

        tabel.getColumns().add(kolom1);
        tabel.getColumns().add(kolom2);
        tabel.getColumns().add(kolom3);

        tabel.getItems().add(
                new Mahasiswa(1, "Muhammad","221081721001" ));
        tabel.getItems().add(
                new Mahasiswa(2, "Qohary","221081721002"));
        tabel.getItems().add(
                new Mahasiswa(3, "Rawidafany", "221081721003"));
        tabel.getItems().add(
                new Mahasiswa(4, "Rawi", "221081721004"));
        tabel.getItems().add(
                new Mahasiswa(5, "Wida", "221081721005"));
        tabel.getItems().add(
                new Mahasiswa(6, "Dafa", "221081721006"));
        tabel.getItems().add(
                new Mahasiswa(7, "Fany", "221081721007"));
        tabel.getItems().add(
                new Mahasiswa(8, "Qoh", "221081721008"));
        tabel.getItems().add(
                new Mahasiswa(9, "Hary", "221081721009"));
        tabel.getItems().add(
                new Mahasiswa(10, "Afan", "221081721010"));

        VBox box = new VBox(tabel);
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}