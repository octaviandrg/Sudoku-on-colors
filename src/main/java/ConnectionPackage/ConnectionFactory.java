package ConnectionPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ConnectionFactory {
    String dbURL;
    String username;
    String password;


    public ConnectionFactory(String dbURL, String user, String pass) throws SQLException {
        this.dbURL = dbURL;
        username = user;
        password = pass;
    }

    public Connection createConnection() throws SQLException {
        return DriverManager.getConnection(dbURL,username,password);
    }

    public void executeInsert(Connection conn, String user, String pass, int score) throws SQLException {
        String sql = "INSERT " +
                "INTO " +
                "accounts " +
                "(username, password, score) " +
                "VALUES (" +
                "'"+
                user +
                "'"+
                "," +
                "'"+
                pass +
                "'"+
                "," +
                score +
                ");";
        System.out.println(sql);

        Statement statement = conn.createStatement();
        int rows = statement.executeUpdate(sql);
        if(rows > 0 ){
            System.out.println("A new user has been added.");
        }
    }

    public void modifyScore(Connection conn, String user) throws SQLException {
        String sql = "UPDATE accounts"+
                " SET"+
                " score = score + 1" +
                " WHERE"+
                " username = "+
                "'"+
                user+
                "'"+
                ";";
        System.out.println(sql);
        Statement statement = conn.createStatement();
        int rows = statement.executeUpdate(sql);
        if(rows > 0 ){
            System.out.println("User score updated.");
        }

    }

    public ArrayList<String> executeSelectAll(Connection conn) throws SQLException {
        ArrayList<String> users = new ArrayList<String>();
        String sql = "SELECT username FROM accounts";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            users.add(resultSet.getString("username"));
        }

        return users;
    }

    public int getScore(Connection conn, String user) throws SQLException {
        int score;
        String sql = "SELECT score FROM accounts WHERE username = " + "'" + user + "';";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        score = Integer.parseInt(resultSet.getString("score"));
        return score;
    }

    public void writeScoreRaport(Connection conn) throws   SQLException {
        String sql = "SELECT username, score FROM accounts";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        HashMap<String, Integer> userScore = new HashMap<>();
        while(resultSet.next()){
            userScore.put(resultSet.getString("username"), Integer.parseInt(resultSet.getString("score")));
        }

        File file = new File("raport.txt");

        BufferedWriter bf = null;

        try {

            // create new BufferedWriter for the output file
            bf = new BufferedWriter(new FileWriter(file));

            // iterate map entries
            for (Map.Entry<String, Integer> entry :
                    userScore.entrySet()) {

                // put key and value separated by a colon
                bf.write(entry.getKey() + ":"
                        + entry.getValue());

                // new line
                bf.newLine();
            }

            bf.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {

            try {

                // always close the writer
                bf.close();
            }
            catch (Exception e) {
            }
        }
    }









    public void closeConnection(Connection conn) throws SQLException {
        conn.close();
    }

}
