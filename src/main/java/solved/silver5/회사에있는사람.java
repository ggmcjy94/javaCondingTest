package solved.silver5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 회사에있는사람 {

    static class Company implements Comparable<Company>{
        String name;
        String status;

        public Company(String name, String status) {
            this.name = name;
            this.status = status;
        }

        @Override
        public int compareTo(Company company) {
            return company.name.compareTo(this.name);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Company> companies = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            String name = input[0];
            String log = input[1];
            companies.add(new Company(name, log));
        }
        Collections.sort(companies);
        ArrayList<String> names = new ArrayList<>();
        for (Company company : companies) {
            if (!company.status.equals("leave")) {
                names.add(company.name);
            } else {
                names.remove(company.name);
            }

        }
        for (String name : names) {
            bw.write(name + "\n");
        }
        bw.flush();
        br.close();
    }
}
