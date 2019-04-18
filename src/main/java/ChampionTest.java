import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class ChampionTest {
    private List<Champion> championList = new ArrayList<Champion>();

    @Before
    public void setUp(){
        //5개의 챔피언 객체를 만듭니다.
        Champion topChamp = new Champion("다리우스","탑");
        Champion jungleChamp = new Champion("리신","정글");
        Champion midChamp = new Champion("르블랑","미드");
        Champion adcChamp = new Champion("베인", "바텀");
        Champion supportChamp = new Champion("레오나", "바텀");

        //앞서 만든 List 에 각 챔피언을 추가합니다.
        championList.add(topChamp);
        championList.add(jungleChamp);
        championList.add(midChamp);
        championList.add(adcChamp);
        championList.add(supportChamp);
    }
    @Test
    public void givenCollectionWhenEmptyCorrect(){
        List<String> emptyList = new ArrayList<String>();
        assertThat(emptyList, empty());
    }
    @Test
    public void notNullCheck(){
        String lck = "LCK";
        assertThat(lck, notNullValue());
    }
    @Test
    public void nullCheck(){
        String lck = null;
        assertThat(lck, nullValue());
    }
    @Test
    public void StringInputCheck(){
        String input = "Player points";
        String prefix = "Player";
        String contains = "point";

        assertThat(input, anyOf(startsWith(prefix), containsString(contains)));
        assertThat(input, is(containsString(contains)));
    }
    @Test
    public void floatTest(){
        assertThat(3.14,closeTo(3,0.2));
    }
    @Test
    public void getDataTest(){
        Champion chap = championList.get(2);
        System.out.println(chap.getName());
        assertThat(championList.get(2),anything());
    }
    @Test
    public void championListTest(){
        //Champion chap = championList.get(2);
        //System.out.println(chap.getName());
        assertThat(championList.size(), is(5));
        assertThat(championList, hasSize(5));
    }
    @Test
    public void propertyTest(){
        assertThat(championList.get(0), Matchers.<Champion>hasProperty("position"));
        assertThat(championList.get(0), Matchers.<Champion>hasProperty("position",hasToString("탑")));
        assertThat(championList.get(0), Matchers.<Champion>hasProperty("position",equalTo("탑")));

    }
    @Test
    public void StringListTest(){
        List<String> champNames = Arrays.asList("애쉬", "갈리오","다리우스");
        assertThat(champNames.get(0),hasToString("애쉬"));
    }
    /*
    @Test
    public void lamdafunctionTest(){
        Optional<Champion> filterChampion = championList.stream()
                .filter(c -> c.getPosition().equals("탑")).findFirst();
        String champName = filterChampion.get().getName();
        assertTrue(champName.equals("다리우스"));
        assertThat(champName, is("다리우스"));
    }*/
    @Test
    public void MapTest(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("supporter","잔나");
        map.put("bottom","애쉬");
        assertThat(map, hasEntry("supporter","잔나"));
        assertThat(map, hasKey("supporter"));
        assertThat(map, hasValue("잔나"));
    }
    @Test
    public void CollectionTest(){
        Champion topChamp = new Champion("다리우스","탑");
        Champion jungleChamp = new Champion("리신","정글");
        assertThat(championList, hasItem(topChamp));
        assertThat(championList, hasItems(topChamp, jungleChamp));
    }

    @Test
    public void GreaterLessEqualTest(){
        assertThat(5, greaterThan(4));
        assertThat(5, greaterThanOrEqualTo(5));
        assertThat(5, lessThan(6));
        assertThat(5, lessThanOrEqualTo(5));
    }

    @Test
    public void StringCaptialAndSpaceTest(){
        assertThat("Hello", equalToIgnoringCase("hello"));
        assertThat("Hello world", equalToIgnoringWhiteSpace("Hello world"));
        assertThat("Hello", containsString("ell"));
        assertThat("Hello", startsWith("He"));
        assertThat("Hello", endsWith("lo"));
    }



}
