package genericsSetMap.exMap.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path:");
        String path = sc.nextLine();
        Map<String, Integer> hashMap = new HashMap<>(); 

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String candidates = br.readLine();
			while (candidates != null) {
				String[] fields = candidates.split(",");
				String name = fields[0];
				int number = Integer.parseInt(fields[1]);

				if (hashMap.containsKey(name)) {
					int votesSoFar = hashMap.get(name);
					hashMap.put(name, number + votesSoFar);
				}
				else {
					hashMap.put(name, number);
				}

				candidates = br.readLine();
			}
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        for (String e: hashMap.keySet()) {
            int candidateNumber = hashMap.get(e);

            System.out.printf("%s: %d\n", e, candidateNumber);
        }

        sc.close();
    }
}
