package wzorce_projektowe;

import java.util.Iterator;

public interface IChannelCollection {

    void addChanel(Channel channel);

    void removeChannel(Channel channel);

    IChannelIterator iterator();

    Iterator<Channel> defaultIterator();

}
