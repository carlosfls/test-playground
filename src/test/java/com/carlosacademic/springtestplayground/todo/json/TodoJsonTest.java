package com.carlosacademic.springtestplayground.todo.json;

import com.jayway.jsonpath.JsonPath;
import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

import static org.assertj.core.api.Assertions.assertThat;

public class TodoJsonTest {

    @Test
    void shouldCompareJson() throws JSONException {
        //arrange
        var expected = """
                {
                    "todos": [
                        {
                            "name":"test 1",
                            "completed":true
                        },
                        {
                            "name":"test 2",
                            "completed":true
                        }
                    ]
                }
                """;
        var data = getJsonData();

        //assert
        JSONAssert.assertEquals(expected, data, false);
    }

    @Test
    void shouldCompareJsonPath() {
        //arrange
        var json = getJsonData();

        //act
        Integer length = JsonPath.read(json, "$.todos.length()");
        String name = JsonPath.read(json, "$.todos[1].name");

        //assert
        assertThat(length)
            .isEqualTo(2);

        assertThat(name)
                .isEqualTo("test 2");
    }

    private String getJsonData(){
        return """
                {
                    "todos": [
                        {
                            "name":"test 1",
                            "completed":true
                        },
                        {
                            "name":"test 2",
                            "completed":true
                        }
                    ]
                }
                """;
    }
}
