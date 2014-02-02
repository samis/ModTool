package in.cloudns.companion.ModTool;

import org.apache.log4j.*;

public class ModTool {

    /**
     * Start and run ModTool
     * 
     * @param args
     */
    static final Logger logger = Logger.getLogger(ModTool.class);

    public static void main(String[] args) {
	logger.debug("Logger configuration loaded");
	ModTool modtool = new ModTool();
	modtool.initialise();
	logger.info("Loading complete. Running ModTool");
	modtool.run();
    }

    private void run() {

    }

    private void initialise() {
	logger.info("ModTool is loading. This shouldn't take long.");

    }

}
