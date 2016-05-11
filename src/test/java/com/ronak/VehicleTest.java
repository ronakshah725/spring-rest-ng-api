//package com.ronak;
//
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import com.ronak.model.Vehicle;
//import com.ronak.repository.VehicleRepository;
//
//public class VehicleTest extends ApplicationTests  {
//	
//    private Vehicle testVehicle;
//    private int testID = 1;
//    private int testYear = 2013;
//    private String testMake = "Suzuki";
//    private String testModel = "Alto";
//    private String base = "Vehicles";
//	
//	@Autowired
//	private WebApplicationContext webApplicationContext;
// 
//    @Autowired
//    private VehicleRepository vehicleRepository;
//
//
//	private MockMvc mockMvc;
//
//	@Before
//	public void setup() {
//
//		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext)
//				.build();
//		
////        this.testVehicle = this.vehicleRepository.save(new Vehicle(testID,testYear,testMake,testModel));
//	}
//	
////	@Test
////	public void validate_get_address() throws Exception {
////
////		mockMvc.perform(get("/address"))
////				.andExpect(status().isOk())
////				.andExpect(
////						content().contentType(MediaType.APPLICATION_JSON_VALUE))
////				.andExpect(jsonPath("$.street").value("12345 Horton Ave"));
////
////	}
//	
//    @Test
//    public void readSingleVehicl() throws Exception {
//    	mockMvc.perform(get("/" +base + "/"+ testID  ))
//        .andExpect(status().isOk())
//        .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
//        .andExpect(jsonPath("$.id").value(String.valueOf(this.testVehicle.getId())))
//        .andExpect(jsonPath("$.year").value(String.valueOf(this.testVehicle.getYear())))
//        .andExpect(jsonPath("$.make").value(this.testVehicle.getMake()))
//        .andExpect(jsonPath("$.model").value(this.testVehicle.getModel()));
//
//    }
//
//
////
////    @Test
////    public void createVehicle() throws Exception {
////
////        
////        String vehicleJson = json(new Vehicle(556, 1001, "Honda", "CRV"));
////        		this.mockMvc.perform(post("/" + base)
////        				.contentType(contentType)
////        				.content(vehicleJson))
////        				.andExpect(status().isCreated());
////    }
//
//	
//	
//}
