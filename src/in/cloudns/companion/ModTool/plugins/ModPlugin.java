package in.cloudns.companion.ModTool.plugins;

import in.cloudns.companion.ModTool.core.Block;
import in.cloudns.companion.ModTool.core.Item;
import net.xeoh.plugins.base.Plugin;

public interface ModPlugin extends Plugin {

    public Item[] getItems();

    public Block[] getBlocks();

    public String getModName();

    public String getModAuthor();

    public String getModVersion();

}
