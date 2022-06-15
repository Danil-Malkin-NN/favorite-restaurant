import com.expediagroup.graphql.generator.SchemaGeneratorConfig
import com.expediagroup.graphql.generator.TopLevelObject
import com.expediagroup.graphql.generator.toSchema
import graphql.schema.GraphQLSchema
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import ru.nino.db.entity.EatingPoint
import ru.nino.db.repository.EatingPointRepository
import java.awt.print.Book

//@Configuration
//@ComponentScan("ru.nino.db.repository")
//class GraphQlJavaConfig(


@Autowired
val eatingPointRepository: EatingPointRepository =


val eatingPoints: List<EatingPoint> = eatingPointRepository.findAll()

class Query {
    fun bookById(id: Long): EatingPoint = eatingPoints { it.id == id }
}

val config = SchemaGeneratorConfig(supportedPackages = "ru.nino.db")
val queries = listOf(TopLevelObject(Query()))
val schema: GraphQLSchema = toSchema(config, queries)
}

