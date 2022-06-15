package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class HardCodedExamples {

    String  baseURI = RestAssured.baseURI = "http://hrm.syntaxtechs.net/syntaxapi/api";
    String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2NTUyNDg1NDcsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTY1NTI5MTc0NywidXNlcklkIjoiMzc3MiJ9.5t9MQzhlJR6Sk38D4YnobwCDcZt832gEBvy9py_Pm8Y";

    @Test
    public void createEmployee(){
    RequestSpecification request = given().header("Content-Type", "application/json").
                header("Authorization", token).body("{\n" +
                        "  \"emp_firstname\": \"manana\",\n" +
                        "  \"emp_lastname\": \"patsatsia\",\n" +
                        "  \"emp_middle_name\": \"MS\",\n" +
                        "  \"emp_gender\": \"F\",\n" +
                        "  \"emp_birthday\": \"2000-06-11\",\n" +
                        "  \"emp_status\": \"Probation\",\n" +
                        "  \"emp_job_title\": \"QA\"\n" +
                        "}");

    Response response = request.when().post("/createEmployee.php");
    response.prettyPrint();

    }


}
