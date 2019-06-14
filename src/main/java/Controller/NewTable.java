package Controller;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.util.Callback;

import java.sql.ResultSet;

public class NewTable {

    //Функция для создания новой таблицы, вынес в отдельный класс, так как очень часто используется
    public static void createTable(TableView tableView, ResultSet executeQuery, boolean isAccessory) {
        ObservableList<ObservableList> data = FXCollections.observableArrayList();
        int columnCount;
        tableView.getColumns().clear();
        try {
            for (int i = 0; i < executeQuery.getMetaData().getColumnCount(); i++) {
                final int j = i;
                if (isAccessory) {
                    columnCount = executeQuery.getMetaData().getColumnCount() - 1;
                    if (i == executeQuery.getMetaData().getColumnCount() - 2) {
                        continue;
                    }
                } else {
                    columnCount = executeQuery.getMetaData().getColumnCount();
                }
                TableColumn column = new TableColumn(executeQuery.getMetaData().getColumnName(i + 1));
                column.setPrefWidth(tableView.getPrefWidth() / columnCount);
                column.setCellValueFactory((Callback<TableColumn.CellDataFeatures<ObservableList, String>, ObservableValue<String>>) param -> new SimpleStringProperty(param.getValue().get(j).toString()));
                tableView.getColumns().addAll(column);
            }
            while (executeQuery.next()) {
                ObservableList<String> row = FXCollections.observableArrayList();
                for (int i = 1 ; i <= executeQuery.getMetaData().getColumnCount(); i++) {
                    row.add(executeQuery.getString(i));
                }
                data.add(row);
            }
            tableView.setItems(data);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ошибка создания таблицы");
        }
    }
}
