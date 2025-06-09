package sec05;

import app.Database;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.result.DeleteResult;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import static com.mongodb.client.model.Filters.eq;

public class DeleteOneTest {
    public static void main(String[] args) {
        MongoCollection<Document> collection = Database.getCollection("users");

        String id = "68356872125aecbdac9522c7"; // 11번
        Bson query = eq("_id", new ObjectId(id));

        DeleteResult deleteResult = collection.deleteOne(query);
        System.out.println("==> DeleteResult : " + deleteResult.getDeletedCount());

        Database.close();

    }
}
