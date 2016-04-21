import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class AllergyTest {
//
  @Test
  public void calculateScore_returnsRockPaper() {
    Allergy yourApp = new Allergy();
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("strawberries");
    expected.add("peanuts");
    assertEquals(expected, yourApp.allergyTest("10"));
  }
  @Test
  public void calculateScore_returnsPaperRock() {
    Allergy yourApp = new Allergy();
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("chocolate");
    expected.add("tomatoes");
    expected.add("eggs");
    assertEquals(expected, yourApp.allergyTest("49"));
  }
  @Test
  public void calculateScore_returnsAll() {
    Allergy yourApp = new Allergy();
    ArrayList<String> expected = new ArrayList<String>();
    expected.add("cats");
    expected.add("pollen");
    expected.add("chocolate");
    expected.add("tomatoes");
    expected.add("strawberries");
    expected.add("shellfish");
    expected.add("peanuts");
    expected.add("eggs");
    assertEquals(expected, yourApp.allergyTest("291"));
  }
  // @Test
  // public void calculateScore_returnsRockScissors() {
  //   Allergy yourApp = new Allergy();
  //   Integer expected = 1;
  //   assertEquals(expected, yourApp.allergyTest("56"));
  // }
  // @Test
  // public void calculateScore_returnsRockRock() {
  //   Allergy yourApp = new Allergy();
  //   Integer expected = 3;
  //   assertEquals(expected, yourApp.winnerTest("rock", "rock"));
  // }
  // @Test
  // public void calculateScore_returnsPaperPaper() {
  //   Allergy yourApp = new Allergy();
  //   Integer expected = 3;
  //   assertEquals(expected, yourApp.winnerTest("paper", "paper"));
  // }
  // @Test
  // public void calculateScore_returnsScissorsPaper() {
  //   Allergy yourApp = new Allergy();
  //   Integer expected = 1;
  //   assertEquals(expected, yourApp.winnerTest("scissors", "paper"));
  // }
  // @Test
  // public void calculateScore_returnsScissorsScissors() {
  //   Allergy yourApp = new Allergy();
  //   Integer expected = 3;
  //   assertEquals(expected, yourApp.winnerTest("scissors", "scissors"));
  // }

}
