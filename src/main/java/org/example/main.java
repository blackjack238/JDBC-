package org.example;

import java.util.List;

public class main {
    public static void main(String[] args) {
        List<MaxProjectCountClient> maxProjectCountClients=new DatabaseQueryService().finMaxprojectsClient();

        System.out.println(maxProjectCountClients.get(0).toString());

    }
}
