package sec03;

import app.Database;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import static com.mongodb.client.model.Filters.eq;

public class FindOneTest {
    public static void main(String[] args) {
        MongoCollection<Document> collection = Database.getCollection("todo");

        String id = "68356783db06e2b5a0b2823e";
        Bson query = eq("_id", new ObjectId(id));

        Document result = collection.find(query).first();
        System.out.println(" ==> findByIdResult : " + result);
        Database.close();
    }
}
