package wzorce_projektowe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ChannelCollectionBasic implements IChannelCollection {

    private List<Channel> channels = new ArrayList<>();

    @Override
    public void addChanel(Channel channel) {
        channels.add(channel);
    }

    @Override
    public void removeChannel(Channel channel) {
        channels.remove(channel);
    }

    @Override
    public IChannelIterator iterator() {
        return new ChannelIterator(channels);
    }

    @Override
    public Iterator<Channel> defaultIterator() {
        return null;
    }

    private class ChannelIterator implements IChannelIterator {

        private List<Channel> channels;
        private int position;

        public ChannelIterator(List<Channel> channels) {
            this.channels = channels;
        }

        @Override
        public boolean hasNext() {
            if (position < channels.size() && channels.get(position) != null) {
                return true;
            }
            return false;
        }

        @Override
        public Channel next() {
            return channels.get(position++);
        }
    }

}