//package ru.scarlet.spring.mvc;
//
//
//import ru.scarlet.spring.mvc.validation.CheckEmail;
//
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;
//import java.util.HashMap;
//import java.util.Map;
//
//public class Location_old {
//    private double longitude;
//
// //   @NotEmpty(message = "Not null")
//    private  double latitude;
//
//    private String type;
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
////value = "abc.com", message = "must end with abc.com"
//    @CheckEmail
//    private String email;
//
//    public Location_old() {
//        types = new HashMap<>();
//        types.put("Озеро", "Озеро");
//        types.put("Парк", "Парк");
//        types.put("Музей", "Музей");
//
//
//        locations = new HashMap<>();
//        locations.put("Moscow Aviation Institute","MAI");
//        locations.put("Kremlin", "Kremlin");
//        locations.put("Metro", "metro");
//
//        consMap = new HashMap<>();
//        consMap.put("Good people", "People");
//        consMap.put("Good place", "Music");
//        consMap.put("Good music", "Music");
//
//
//    }
////    @NotNull(message = "Not null")
//    private Map<String, String> types;
////    @NotNull(message = "Not null")
//    private Map<String, String> locations;
////    @NotNull(message = "Not null")
//    private Map<String, String> consMap;
//
//    public Map<String, String> getConsMap() {
//        return consMap;
//    }
//
//    public void setConsMap(Map<String, String> consMap) {
//        this.consMap = consMap;
//    }
//
//    private String[] cons;
//    public Map<String, String> getLocations() {
//        return locations;
//    }
//
//    public String[] getCons() {
//        return cons;
//    }
//
//    public void setCons(String[] cons) {
//        this.cons = cons;
//    }
//
//    public void setLocations(Map<String, String> locations) {
//        this.locations = locations;
//    }
//
//    @NotNull(message = "Not null")
//    @NotEmpty(message = "Not Empty")
//    @NotBlank(message = "Not Blank")
//    private String Naming;
//
////    @NotNull(message = "Not null")
////    @NotEmpty(message = "Not Empty")
////    @NotBlank(message = "Not Blank")
//    public String getNaming() {
//        return Naming;
//    }
//
//
//    public void setNaming(String naming) {
//        Naming = naming;
//    }
//
//    public Map<String, String> getTypes() {
//        return types;
//    }
//
//    public void setTypes(Map<String, String> types) {
//        this.types = types;
//    }
//
//    @Override
//    public String toString() {
//        return "Location{" +
//                "longitude=" + longitude +
//                ", latitude=" + latitude +
//                ", type='" + type + '\'' +
//                '}';
//    }
//
//    public double getLongitude() {
//        return longitude;
//    }
//
//    public void setLongitude(double longitude) {
//        this.longitude = longitude;
//    }
//
//    public double getLatitude() {
//        return latitude;
//    }
//
//    public void setLatitude(double latitude) {
//        this.latitude = latitude;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//}
