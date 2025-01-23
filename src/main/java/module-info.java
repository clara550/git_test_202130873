module org.calma.test_git_202130873 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.calma.test_git_202130873 to javafx.fxml;
    exports org.calma.test_git_202130873;
}