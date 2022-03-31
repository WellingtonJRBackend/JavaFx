module com.estudo.projetojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.estudo.projetojavafx to javafx.fxml;
    exports com.estudo.projetojavafx;
}