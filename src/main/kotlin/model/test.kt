import kotlinx.serialization.Serializable

@Serializable
data class Frontender(
    val type: String,
    val img: String,
    val skills: List<String>,
    val debuff: List<String>,
)
@Serializable
data class FrontenderList(val list: List<Frontender>)

@Serializable
data class Answer(val title: String, val weight: Int)

@Serializable
data class Question(
    val type: String,
    val priority: Int,
    val question: String,
    val answers: List<Answer>,
    var points: Int)

@Serializable
data class QuestionList(val list: List<Question>)