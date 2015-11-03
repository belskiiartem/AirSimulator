package belskii.artem.AirSimulator.AirApparat;

public abstract class AirApprart {
private String type;
private String number;
private String latitude;
private String longitude;
private String elevation;
private String track;

public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getLatitude() {
	return latitude;
}
public void setLatitude(String latitude) {
	this.latitude = latitude;
}
public String getLongitude() {
	return longitude;
}
public void setLongitude(String longitude) {
	this.longitude = longitude;
}
public String getElevation() {
	return elevation;
}
public void setElevation(String elevation) {
	this.elevation = elevation;
}
public String getTrack() {
	return track;
}
public void setTrack(String track) {
	this.track = track;
}
}
