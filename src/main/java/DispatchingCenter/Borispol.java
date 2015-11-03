package DispatchingCenter;

import java.lang.invoke.MethodHandles;
import org.jgroups.JChannel;
import org.jgroups.Message;
import org.jgroups.ReceiverAdapter;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Borispol {
	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	private static final String CONFIG_PATH = "config.xml";
	private static final String CLUSTER_NAME = "AirDispatchingCenter";
	private JChannel channel;

	public void send(JSONObject jsonObject){
            try {
                Message msg = new Message(null, null, String.valueOf(jsonObject));
                channel.send(msg);
            } catch (Exception e) {
            	e.printStackTrace();
                logger.info("Bye!");
                channel.close();
            }
     
	}

	
    public void runDispathingCenter() throws Exception {
        channel = new JChannel(MethodHandles.lookup().lookupClass().getClassLoader().getResource(CONFIG_PATH));
        channel.setReceiver(new ReceiverAdapter() {
            @Override
            public void receive(Message msg) {
                logger.info("Borispol dispather center :: [{}] -> [{}] :: {}", msg.src(), msg.dest(), msg.getObject());
            }
        });

        channel.connect(CLUSTER_NAME);

    }	
}
