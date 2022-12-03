import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromDynamic

object DataSource {
    private val questionList: dynamic = js("require('./data.json')")
    private val frontenderList: dynamic = js("require('./front_types.json')")
    val testData = Json.decodeFromDynamic(QuestionList.serializer(), questionList)
    val frontenderData = Json.decodeFromDynamic(FrontenderList.serializer(), frontenderList)
}