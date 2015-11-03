package belskii.artem.AirSimulator.AirApparat;

import java.util.Random;

import org.json.JSONObject;

public class Airplane extends AirApprart {
	Random random = new Random();
	JSONObject resultJson = new JSONObject();
	
	public JSONObject getCurrentInfo() {
		this.setElevation(this.getElevation()+random.nextInt(20));
		this.setLatitude(this.getLatitude()+random.nextInt(20));
		this.setLongitude(this.getLatitude()+random.nextInt(20));

		resultJson.put("type",this.getType());
		resultJson.put("number",this.getNumber());
		resultJson.put("latitude",this.getLatitude());
		resultJson.put("longitude",this.getLongitude());
		resultJson.put("elevation",this.getElevation());
		resultJson.put("track",this.getTrack());		
		return resultJson;
	}
}
