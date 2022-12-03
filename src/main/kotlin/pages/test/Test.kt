package pages.test
import DataSource
import TestResult
import csstype.*
import react.FC
import react.Props
import react.dom.html.ReactHTML.div
import react.css.css
import react.useEffect
import react.useState


val Test = FC<Props> {
    val questionList by useState(DataSource.testData.list.shuffled())
    var currentQuestionId by useState(0)
    var question  by useState(questionList[0])
    var showResult by useState(false)

    useEffect(currentQuestionId) {
        if (currentQuestionId == questionList.size) {
            showResult = true
            return@useEffect
        }
        question = questionList[currentQuestionId]
    }

    div {
        css {
            display = Display.flex
            flexDirection = FlexDirection.column
            alignItems = AlignItems.center
            justifyContent = JustifyContent.center
            flex = Flex.maxContent
        }
        if (!showResult) {
            div {
                css {
                    textAlign = TextAlign.center
                    fontFamily = FontFamily.sansSerif
                    fontWeight = FontWeight.bold
                    fontSize = 32.px
                    color = Color("black")
                }
                +"${question.question}"
            }
            div {
                css {
                    display = Display.flex
                    flexDirection = FlexDirection.row
                    justifyContent = JustifyContent.center
                    marginTop = 30.px
                }
                div {
                    css {
                        width = 20.px
                    }
                }
                for (answer in question.answers) {
                    div {
                        css {
                            display = Display.flex
                            justifyContent = JustifyContent.center
                            alignItems = AlignItems.center
                            width = 150.px
                            padding = 10.px
                            borderRadius = 8.px
                            fontFamily = FontFamily.sansSerif
                            fontWeight = FontWeight.bold
                            fontSize = FontSize.large
                            textAlign = TextAlign.center
                            border = Border(2.px, LineStyle.solid, Color("black"))
                            color = Color("black")
                            marginRight = 20.px
                        }
                        onClick = {
                            questionList[currentQuestionId].points = answer.weight
                            currentQuestionId += 1
                        }
                        +"${answer.title}"
                    }
                }
            }
        } else {
            TestResult {
                questions = questionList
            }
        }
    }
}

