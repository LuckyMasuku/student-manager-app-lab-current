package ie.gmit.phonemanager;

import java.io.Serializable;

public class Phone implements Serializable {

    private static final long serialVersionUID = 1L;
    
    // Instance Variables
	private String phoneId;
	private String model;
    private String type;
    
	// Constructors
	public Phone(String phoneId) {
		this.phoneId = phoneId;
	}
	
	public Phone(String phoneId, String model, String type) {
	// this(phoneId); - could set phoneId this way
		this.phoneId = phoneId;
		this.model = model;
        this.type = type;
    }

    // Getters and Setters
	public String getPhoneId() {
		return phoneId;
	}
     //Set phone
	public void setPhoneId(String phoneId) {
		this.phoneId = phoneId;
	}
    //Get model
	public String getModel() {
		return model;
	}
     //Set model
	public void setModel(String model) {
		this.model = model;
    }
     //Get type
    public String getType() {
		return type;
	}
     //Set type
    public void setType(String type) {
		this.type = type;
    }
}