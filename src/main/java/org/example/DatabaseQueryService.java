package org.example;


import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {
public List<MaxProjectCountClient>  finMaxprojectsClient(){
    List<MaxProjectCountClient> result=new ArrayList<>();
    String sqlFile ="./src/main/java/sql/find_max_projects_client.sql";
    String sqlQuery= readSqlFile(sqlFile);
    Connection conn= Database.getINSTANCE().getConnection();
    try {
        Statement statement= conn.createStatement();
        ResultSet resultSet=statement.executeQuery(sqlQuery);
        while (resultSet.next()){
            String name =resultSet.getString("name");
            int projectCount =resultSet.getInt("project_count");
            MaxProjectCountClient client =new  MaxProjectCountClient(name,projectCount);
result.add(client);
        }
        resultSet.close();
        statement.close();

    }catch (SQLException e){
        e.printStackTrace();
    }finally {
        try {
            conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    return result;
}

    private String readSqlFile(String fileName) {
    StringBuilder content=new StringBuilder();
    try (BufferedReader br=new BufferedReader(new FileReader(fileName))) {
        String line;
        while ((line = br.readLine()) != null) {
            content.append(line).append("\n");

        }
    }catch (IOException e){
        e.printStackTrace();
    }
    return content.toString();
    }

    }


