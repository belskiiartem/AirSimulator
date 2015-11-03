package belskii.artem.AirSimulator.AirApparat;

import java.util.Random;

import org.json.JSONObject;

public class Helicopter extends AirApprart{
	Random random = new Random();
	JSONObject resultJson = new JSONObject();
	
	public JSONObject getCurrentInfo() {
		this.setElevation(this.getElevation()+String.valueOf(random.nextInt(10)));
		this.setLatitude(this.getLatitude()+String.valueOf(random.nextInt(10)));
		this.setLongitude(this.getLatitude()+String.valueOf(random.nextInt(10)));

		resultJson.put("type",this.getType());
		resultJson.put("number",this.getNumber());
		resultJson.put("latitude",this.getLatitude());
		resultJson.put("longitude",this.getLongitude());
		resultJson.put("elevation",this.getElevation());
		resultJson.put("track",this.getTrack());		
		return resultJson;
	}

}
