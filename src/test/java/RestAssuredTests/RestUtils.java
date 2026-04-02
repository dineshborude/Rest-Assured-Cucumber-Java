package RestAssuredTests;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.HashMap;

public class RestUtils {

    public HashMap<String,String> getUser() {

        HashMap<String,String> map = new HashMap<>();
        map.put("name",("TestUser"+RandomStringUtils.randomAlphabetic(2)));
        map.put("job",("QA Engineer"));

        return map;
    }

}
