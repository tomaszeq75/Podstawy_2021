package wzorce_projektowe;

public class IteratorApp {

    public static void main(String[] args) {

        IChannelCollection channelCollection = new ChannelCollectionBasic();
        channelCollection.addChanel(new Channel("mtv"));
        channelCollection.addChanel(new Channel("sport"));
        channelCollection.addChanel(new Channel("555"));
        channelCollection.addChanel(new Channel("eurosport"));

        IChannelIterator channelIterator = channelCollection.iterator();
        while (channelIterator.hasNext()) {
            System.out.println(channelIterator.next());
        }


    }

}
