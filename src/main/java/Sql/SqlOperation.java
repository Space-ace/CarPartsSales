package Sql;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Класс содержащий sql запросы
public class SqlOperation {
    public static ResultSet selectAccessory(String tableName, String columnName, String carTableName, String cellValue) throws SQLException {
        Statement statement = SqlConnection.getInstance().getConnection().createStatement();
        ResultSet executeQuery = statement.executeQuery("SELECT " + columnName + " FROM " + tableName + " WHERE AutoId = (SELECT id from Авто WHERE Марка = '" + carTableName + "') AND Название LIKE " + "'%" + cellValue + "%'");
        return executeQuery;
    }

    public static ResultSet selectCustomer(String tableName, String columnName, String cellValue, int columnNumber) throws SQLException {
        Statement statement = SqlConnection.getInstance().getConnection().createStatement();
        ResultSet executeQuery = statement.executeQuery("SELECT " + columnName + " FROM " + tableName);
        executeQuery = statement.executeQuery("SELECT " + columnName + " FROM " + tableName + " WHERE " + executeQuery.getMetaData().getColumnName(columnNumber) + " LIKE " + "'%" + cellValue + "%'");
        return executeQuery;
    }

    public static ResultSet selectEmployess(String tableName, String columnName) throws SQLException {
        Statement statement = SqlConnection.getInstance().getConnection().createStatement();
        ResultSet executeQuery = statement.executeQuery("SELECT " + columnName + " FROM " + tableName);
        return executeQuery;
    }

    public static ResultSet selectOrder(String cellValue) throws SQLException {
        Statement statement = SqlConnection.getInstance().getConnection().createStatement();
        statement.executeUpdate("IF OBJECT_ID('tempdb.dbo.#ProductSummary', 'U') IS NOT NULL DROP TABLE #ProductSummary");
        statement.executeUpdate("CREATE TABLE #ProductSummary (ProdId INT, [Имя комплектующей] NVARCHAR(20), Название NVARCHAR(20), Производитель NVARCHAR(20), Имя NVARCHAR(20), Телефон NVARCHAR(20), [Имя продавца] NVARCHAR(20), [Фамилия продавца] NVARCHAR(20), Цена MONEY)");
        statement.executeUpdate("INSERT INTO #ProductSummary (ProdId, [Имя комплектующей], b.Название, b.Производитель, c.Имя, c.Телефон, [Имя продавца], [Фамилия продавца], a.Цена) SELECT a.id, [Имя комплектующей], b.Название, b.Производитель, c.Имя, c.Телефон, d.Имя, d.Фамилия, a.Цена FROM Заказы AS a INNER JOIN Шина AS b ON a.AccessoryId = b.id AND a.[Имя комплектующей] = 'Шина' INNER JOIN Покупатели AS c ON a.CustomerId = c.id INNER JOIN Сотрудники AS d ON a.Продавец = d.id");
        statement.executeUpdate("INSERT INTO #ProductSummary (ProdId, [Имя комплектующей], b.Название, b.Производитель, c.Имя, c.Телефон, [Имя продавца], [Фамилия продавца], a.Цена) SELECT a.id, [Имя комплектующей], b.Название, b.Производитель, c.Имя, c.Телефон, d.Имя, d.Фамилия, a.Цена FROM Заказы AS a INNER JOIN Колесо AS b ON a.AccessoryId = b.id AND a.[Имя комплектующей] = 'Колесо' INNER JOIN Покупатели AS c ON a.CustomerId = c.id INNER JOIN Сотрудники AS d ON a.Продавец = d.id");
        statement.executeUpdate("INSERT INTO #ProductSummary (ProdId, [Имя комплектующей], b.Название, b.Производитель, c.Имя, c.Телефон, [Имя продавца], [Фамилия продавца], a.Цена) SELECT a.id, [Имя комплектующей], b.Название, b.Производитель, c.Имя, c.Телефон, d.Имя, d.Фамилия, a.Цена FROM Заказы AS a INNER JOIN Аккумулятор AS b ON a.AccessoryId = b.id AND a.[Имя комплектующей] = 'Аккумулятор' INNER JOIN Покупатели AS c ON a.CustomerId = c.id INNER JOIN Сотрудники AS d ON a.Продавец = d.id");
        statement.executeUpdate("INSERT INTO #ProductSummary (ProdId, [Имя комплектующей], b.Название, b.Производитель, c.Имя, c.Телефон, [Имя продавца], [Фамилия продавца], a.Цена) SELECT a.id, [Имя комплектующей], b.Название, b.Производитель, c.Имя, c.Телефон, d.Имя, d.Фамилия, a.Цена FROM Заказы AS a INNER JOIN Дворник AS b ON a.AccessoryId = b.id AND a.[Имя комплектующей] = 'Дворник' INNER JOIN Покупатели AS c ON a.CustomerId = c.id INNER JOIN Сотрудники AS d ON a.Продавец = d.id");
        statement.executeUpdate("INSERT INTO #ProductSummary (ProdId, [Имя комплектующей], b.Название, b.Производитель, c.Имя, c.Телефон, [Имя продавца], [Фамилия продавца], a.Цена) SELECT a.id, [Имя комплектующей], b.Название, b.Производитель, c.Имя, c.Телефон, d.Имя, d.Фамилия, a.Цена FROM Заказы AS a INNER JOIN Радиатор AS b ON a.AccessoryId = b.id AND a.[Имя комплектующей] = 'Радиатор' INNER JOIN Покупатели AS c ON a.CustomerId = c.id INNER JOIN Сотрудники AS d ON a.Продавец = d.id");
        statement.executeUpdate("INSERT INTO #ProductSummary (ProdId, [Имя комплектующей], b.Название, b.Производитель, c.Имя, c.Телефон, [Имя продавца], [Фамилия продавца], a.Цена) SELECT a.id, [Имя комплектующей], b.Название, b.Производитель, c.Имя, c.Телефон, d.Имя, d.Фамилия, a.Цена FROM Заказы AS a INNER JOIN [Тормозной диск] AS b ON a.AccessoryId = b.id AND a.[Имя комплектующей] = 'Тормозной диск' INNER JOIN Покупатели AS c ON a.CustomerId = c.id INNER JOIN Сотрудники AS d ON a.Продавец = d.id");
        ResultSet executeQuery = statement.executeQuery("SELECT * FROM #ProductSummary WHERE Название LIKE '%" + cellValue + "%'");
        return executeQuery;
    }

    public static ResultSet selectSeller(String tableName, String columnName, String cellValue) throws SQLException {
        Statement statement = SqlConnection.getInstance().getConnection().createStatement();
        ResultSet executeQuery;
        if (cellValue.equals("")) {
            executeQuery = statement.executeQuery("SELECT " + columnName + " FROM " + tableName);
        } else {
            executeQuery = statement.executeQuery("SELECT " + columnName + " FROM " + tableName + " WHERE id = '" + cellValue + "'");
        }
        return executeQuery;
    }

    public static void insert(String tableName, String cellValue) throws SQLException {
        Statement statement = SqlConnection.getInstance().getConnection().createStatement();
        statement.executeUpdate("INSERT INTO " + tableName + " VALUES " + cellValue);
    }

    public static void update(String tableName, String columnName, String cellValue, String id) throws SQLException {
        Statement statement = SqlConnection.getInstance().getConnection().createStatement();
        statement.executeUpdate("UPDATE " + tableName + " SET " + columnName + " = '" + cellValue + "' WHERE id = '" + id + "'");
    }

    public static void updateEmployees(String columnName, String newValue, String oldValue) throws SQLException {
        Statement statement = SqlConnection.getInstance().getConnection().createStatement();
        statement.executeUpdate("UPDATE Сотрудники SET " + columnName + " = '" + newValue + "' WHERE " + columnName + " = '" +oldValue + "'");
    }

    public static void updateEmployees(String columnName, int newValue, int oldValue) throws SQLException {
        Statement statement = SqlConnection.getInstance().getConnection().createStatement();
        statement.executeUpdate("UPDATE Сотрудники SET " + columnName + " = " + newValue + " WHERE " + columnName + " = " +oldValue);
    }

    public static void deleteCustomer(String tableName, String columnName, String cellValue, String id) throws SQLException {
        Statement statement = SqlConnection.getInstance().getConnection().createStatement();
        statement.executeUpdate("DELETE FROM Заказы WHERE CustomerId = '" + id + "'");
        statement.executeUpdate("DELETE FROM " + tableName + " WHERE " + columnName + " = '" + cellValue + "'");
    }

    public static void deleteEmployees(String tableName, String columnName, int id) throws SQLException {
        Statement statement = SqlConnection.getInstance().getConnection().createStatement();
        statement.executeUpdate("DELETE FROM Заказы WHERE Продавец = " + id );
        statement.executeUpdate("DELETE FROM " + tableName + " WHERE " + columnName + " = " + id);
    }

    public static void deleteOrder(String tableName, String columnName, String cellValue) throws SQLException {
        Statement statement = SqlConnection.getInstance().getConnection().createStatement();
        statement.executeUpdate("DELETE FROM " + tableName + " WHERE " + columnName + " = '" + cellValue + "'");
    }
}
