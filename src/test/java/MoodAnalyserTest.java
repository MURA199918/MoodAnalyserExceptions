import com.mechanitis.demo.intellij.MoodAnalyser;
import com.mechanitis.demo.intellij.MoodAnalyserException;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {

    @Test
    public void testMoodAnalysis() throws Exception{
        MoodAnalyser moodAnalyser = new MoodAnalyser("SAD");
        String mood=moodAnalyser.analyseMood();
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }
    @Test
    public void testMoodAnalysis1() throws Exception{
        MoodAnalyser moodAnalyser = new MoodAnalyser("HAPPY");
        String mood = moodAnalyser.analyseMood();
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }
    @Test
    public void givenNullMoodreturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser=new MoodAnalyser(null);
        String mood=moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
    @Test
    public void givennullmoodreturnhappy1() {
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
    }
    @Test
    public void givennullmoodreturnexception(){
        MoodAnalyser moodAnalyser=new MoodAnalyser(null);
        try{
            moodAnalyser.analyseMood(null);
        }catch (MoodAnalyserException e){
            Assert.assertEquals("Please enter valid message",e.getMessage());
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL,e.type);
        }
    }
}
