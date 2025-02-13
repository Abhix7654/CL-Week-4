package mapinterface;


import java.util.*;

public class VotingSystem {

    public static Map<String, Integer> votesHashMap = new HashMap<>();
    public static Map<String, Integer> votesLinkedHashMap = new LinkedHashMap<>();
    public static TreeMap<String, Integer> votesTreeMap = new TreeMap<>();


    public static void castVote(String candidate) {
        votesHashMap.put(candidate, votesHashMap.getOrDefault(candidate, 0) + 1);
        votesLinkedHashMap.put(candidate, votesLinkedHashMap.getOrDefault(candidate, 0) + 1);
        votesTreeMap.put(candidate, votesTreeMap.getOrDefault(candidate, 0) + 1);
    }


    public static int getVotes(String candidate) {
        return votesHashMap.getOrDefault(candidate, 0);
    }


    public static Map<String, Integer> getSortedResults() {
        return votesTreeMap;
    }


    public static Map<String, Integer> getVotesInOrder() {
        return votesLinkedHashMap;
    }


    public static void displayResults() {
        System.out.println("\n Voting Results");

        System.out.println("\nSorted Order TreeMap ");
        for (Map.Entry<String, Integer> entry : votesTreeMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("\nOrder of Voting LinkedHashMap ");
        for (Map.Entry<String, Integer> entry : votesLinkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        castVote("Rahul");
        castVote("Abhishek");
        castVote("Muskan");
        castVote("Abhishek");
        castVote("Muskan");
        castVote("Abhishek");
        castVote("Rahul");


        System.out.println("Votes for Abhishek: " + getVotes("Abhishek"));
        System.out.println("Votes for Muskan: " + getVotes("Muskan"));
        System.out.println("Votes for Rahul: " + getVotes("Rahul"));

        displayResults();
    }
}

