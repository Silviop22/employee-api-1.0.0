package com.luarasi.employeeapi100.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.luarasi.employeeapi100.models.Employee;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;

import javax.servlet.http.HttpServletRequest;
import javax.sound.midi.Patch;
import javax.validation.Valid;
import java.sql.SQLException;
import java.util.HashMap;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-08-28T14:04:36.877+02:00")

@Controller
public class EmployeeAPIController implements EmployeeAPI {
    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public EmployeeAPIController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @Override
    public ResponseEntity<Object> create(@Valid Employee employee, String xSourceOperator, String xSourceSystem, String xSourceTimestamp, String accept, String acceptLanguage, String uuid, MultiValueMap<String, String> headers, MultiValueMap<String, String> queryParameters) {
        return null;
    }

    @Override
    public ResponseEntity<Employee> delete(String id, @Valid Patch employee) {
        return null;
    }

    @Override
    public ResponseEntity<Object> get(String xSourceOperator, String xSourceSystem, String xSourceTimestamp, String accept, String acceptLanguage, String uuid, HttpEntity httpEntity, MultiValueMap<String, String> uriParameters, HashMap<String, String> uriVariables) throws SQLException, JsonProcessingException {
        String jsonResponse = "{\n" +
                "    \"id\": \"J90402042P\",\n" +
                "    \"title\": \"PHD\",\n" +
                "    \"type\": \"Full Time\",\n" +
                "    \"status\": \"active\",\n" +
                "    \"createdDate\": \"20-FEB-21\",\n" +
                "    \"desc\": \"comment\",\n" +
                "    \"department\": \"Informatike Ekonomike\",\n" +
                "    \"employeeCredentials\": {\n" +
                "      \"firstname\": \"Silvio\",\n" +
                "      \"patrialname\": \"Alfred\",\n" +
                "      \"lastname\": \"progonati\"\n" +
                "    },\n" +
                "    \"characteristicValues\": [\n" +
                "      {\n" +
                "        \"key\": \"birthdate\",\n" +
                "        \"value\": \"02/04/1999\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"key\": \"gender\",\n" +
                "        \"value\": \"male\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"key\": \"birthplace\",\n" +
                "        \"value\": \"Tirana\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"key\": \"matrimonial_status\",\n" +
                "        \"value\": \"Beqar\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"key\": \"nationality\",\n" +
                "        \"value\": \"Shqipetar\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"key\": \"address\",\n" +
                "        \"value\": \"Rr. Ibrahim Kodra, 6, Tirane 1010\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }";
        Employee responseObject = null;
        ObjectMapper mapper = new ObjectMapper();
        responseObject = mapper.readValue(jsonResponse, new TypeReference<Employee>() {
        });

        return new ResponseEntity<Object>(responseObject, HttpStatus.valueOf(200));
    }

    @Override
    public ResponseEntity<Object> getList(@Valid String id, String category, @Valid String type, @Valid String status, @Valid String created, @Valid String hierarchyId, @Valid String field, @Valid Integer limit, @Valid Integer count, @Valid String sort, String xSourceOperator, String xSourceSystem, String xSourceTimestamp, String accept, String acceptLanguage, String uuid, HttpEntity httpEntity, MultiValueMap<String, String> uriParameters) {
        return null;
    }

    @Override
    public ResponseEntity<Object> updatePartial(String id, @Valid Employee productOffering, String xSourceOperator, String xSourceSystem, String xSourceTimestamp, String acceptLanguage, String uuid, MultiValueMap<String, String> headers, MultiValueMap<String, String> uriParameters, HashMap<String, String> uriVariables) {
        return null;
    }

}
