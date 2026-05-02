package config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

/**
 *
 * @author Ricardo
 */
public class MongoClientProvider {
    private static MongoClientProvider instance;
    private final MongoClient mongoClient;
    private final MongoDatabase database;

    private MongoClientProvider() {
        CodecRegistry pojoCodecRegistry = fromRegistries(
                MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build())
        );

        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString("mongodb://localhost:27017")) 
                .codecRegistry(pojoCodecRegistry)
                .build();

        this.mongoClient = MongoClients.create(settings);
        this.database = this.mongoClient.getDatabase("LearnUp");
    }

    public static synchronized MongoClientProvider getInstance() {
        if (instance == null) {
            instance = new MongoClientProvider();
        }
        return instance;
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    public <T> MongoCollection<T> getCollection(String collectionName, Class<T> clazz) {
        return database.getCollection(collectionName, clazz);
    }
    
    public void close() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }
}