import com.mechanitis.demo.intellij.MoodAnalyser;
import com.mechanitis.demo.intellij.MoodAnalyserException;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {

    @Test
    public void testMoodAnalysis() throws Exception{
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood=moodAnalyser.analyseMood("Sad message");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }
    @Test
    public void testMoodAnalysis1() throws Exception{
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("Happy message");
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }
    /*@Test
    public void givenNullMoodreturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser=new MoodAnalyser(null);
        String mood=moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void givennullmoodreturnhappy1(){
        MoodAnalyser moodAnalyser =new MoodAnalyser(null);
        String mood=null;
        try{
            ExpectedException exceptionRule=ExpectedException.none();
            exceptionRule.expect(MoodAnalyserException.class);
            mood=moodAnalyser.analyseMood();
            Assert.assertEquals("Happy",mood);
        }catch(MoodAnalyserException e){
            e.printStackTrace();
        }
       // Assert.assertEquals("Happy",mood);
    }*/
}
