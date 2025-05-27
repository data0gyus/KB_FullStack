package sec03;

import app.Database;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import java.util.Iterator;

public class FindTest {
    public static void main(String[] args) {
        MongoCollection<Document> collection = Database.getCollection("todo");

        FindIterable<Document> iterable = collection.find();

        Iterator itr = iterable.iterator();
        while(itr.hasNext()) {
            System.out.println("==> findResultRow : "+itr.next());
        }

        Database.close();

    }
}
