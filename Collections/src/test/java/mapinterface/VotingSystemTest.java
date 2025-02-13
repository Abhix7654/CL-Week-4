package mapinterface;

import static mapinterface.VotingSystem.castVote;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Map;

public class VotingSystemTest {

    @BeforeEach
    void setUp() {
        castVote("Rahul");
        castVote("Abhishek");
        castVote("Muskan");
        castVote("Abhishek");
        castVote("Muskan");
        castVote("Abhishek");
        castVote("Rahul");
    }

    @Test
    void testCastVote() {
        assertEquals(3, VotingSystem.getVotes("Abhishek"));
        assertEquals(2, VotingSystem.getVotes("Muskan"));
        assertEquals(2, VotingSystem.getVotes("Rahul"));
        assertEquals(0, VotingSystem.getVotes("Mayank"));
    }

    @Test
    void testSortedResults() {
        Map<String, Integer> sortedResults = VotingSystem.getSortedResults();

        assertEquals(3, sortedResults.size());
        assertEquals(3, sortedResults.get("Abhishek"));
        assertEquals(2, sortedResults.get("Muskan"));
        assertEquals(2, sortedResults.get("Rahul"));

        assertTrue(sortedResults.keySet().toArray()[0].equals("Abhishek"));
        assertTrue(sortedResults.keySet().toArray()[1].equals("Muskan"));
        assertTrue(sortedResults.keySet().toArray()[2].equals("Rahul"));
    }

    @Test
    void testVotesInOrder() {
        Map<String, Integer> votesInOrder = VotingSystem.getVotesInOrder();

        assertEquals(3, votesInOrder.size());
        assertEquals(3, votesInOrder.get("Abhishek"));
        assertEquals(2, votesInOrder.get("Muskan"));
        assertEquals(2, votesInOrder.get("Rahul"));

        assertTrue(votesInOrder.keySet().toArray()[0].equals("Rahul"));
        assertTrue(votesInOrder.keySet().toArray()[1].equals("Abhishek"));
        assertTrue(votesInOrder.keySet().toArray()[2].equals("Muskan"));
    }
}
