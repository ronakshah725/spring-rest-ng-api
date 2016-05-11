//package com.ronak;
//
//import static org.hamcrest.Matchers.is;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.io.IOException;
//import java.nio.charset.Charset;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.SpringApplicationConfiguration;
//import org.springframework.http.MediaType;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
//import org.springframework.mock.http.MockHttpOutputMessage;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import com.ronak.model.Vehicle;
//import com.ronak.repository.VehicleRepository;
//
///**
// * @author Ronak Shah
// */
//
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(classes = Application.class)
//@WebAppConfiguration
//public class VehicleControllerTest {
//
//
//	 private MediaType contentType = new MediaType(
//	            "application", "hal+json");
//
//    private MockMvc mockMvc;
//
//    private Vehicle testVehicle;
//    private int testID = 555;
//    private int testYear = 1000;
//    private String testMake = "dummyMake";
//    private String testModel = "dummyModel";
//    private String base = "Vehicles";
//
//    private HttpMessageConverter mappingJackson2HttpMessageConverter;
//
//    private List<Vehicle> vehicleList = new ArrayList<>();
//
//    @Autowired
//    private VehicleRepository vehicleRepository;
//
//    @Autowired
//    private WebApplicationContext webApplicationContext;
//
//
//    @Autowired
//    void setConverters(HttpMessageConverter<?>[] converters) {
//    	
//
//
//        this.mappingJackson2HttpMessageConverter = Arrays.asList(converters).stream().filter(
//                hmc -> hmc instanceof MappingJackson2HttpMessageConverter).findAny().get();
//
//        Assert.assertNotNull("the JSON message converter must not be null",
//                this.mappingJackson2HttpMessageConverter);
//    }
//
//    @Before
//    public void setup() throws Exception {
//   	 	
//    	this.mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
//    	
//        this.testVehicle = this.vehicleRepository.save(new Vehicle(testID,testYear,testMake,testModel));
//
//    }
//
//
//
//    @Test
//    public void readSingleVehicl() throws Exception {
//    	mockMvc.perform(get("/" +base + "/"+ testID  ))
//        .andExpect(status().isOk())
//        .andExpect(content().contentType(contentType))
//        .andExpect(jsonPath("$.id", is(this.testVehicle.getId().intValue())))
//        .andExpect(jsonPath("$.year", is(this.testVehicle.getYear())))
//        .andExpect(jsonPath("$.make", is(this.testVehicle.getMake())))
//        .andExpect(jsonPath("$.model", is(this.testVehicle.getModel())));
//
//    }
//
//
//
//    @Test
//    public void createVehicle() throws Exception {
//
//        
//        String vehicleJson = json(new Vehicle(556, 1001, "Honda", "CRV"));
//        		this.mockMvc.perform(post("/" + base)
//        				.contentType(contentType)
//        				.content(vehicleJson))
//        				.andExpect(status().isCreated());
//    }
//
//    protected String json(Object o) throws IOException {
//        MockHttpOutputMessage mockHttpOutputMessage = new MockHttpOutputMessage();
//        this.mappingJackson2HttpMessageConverter.write(
//                o, MediaType.APPLICATION_JSON, mockHttpOutputMessage);
//        return mockHttpOutputMessage.getBodyAsString();
//    }
//}
