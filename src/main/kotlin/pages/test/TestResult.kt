import csstype.*
import react.FC
import react.Props
import react.css.css
import react.dom.html.ReactHTML.img
import react.dom.html.ReactHTML.div

external interface ResultsProps: Props {
   var questions: List<Question>
}

val TestResult = FC<ResultsProps> { props ->
    val frontenderList = DataSource.frontenderData.list
    val totalPoints = props.questions.map { it.points}.sum()

    div {
        css {
            display = Display.flex
            justifyContent = JustifyContent.center
            alignItems = AlignItems.center
        }
        if (totalPoints == 0) {
            val front = frontenderList.first { it.type == Frontenders.MASCOT.type }
            img {
                css {
                    width = 400.px
                    height = 400.px
                    backgroundSize = BackgroundSize.cover
                }
                src = front.img
            }
            Lists {
                data = front
            }
        }
        if (totalPoints == 15) {
            val front = frontenderList.first { it.type == Frontenders.MEGABRAIN.type }
            img {
                css {
                    width = 400.px
                    height = 400.px
                    backgroundSize = BackgroundSize.cover
                }
                src = front.img
            }
            Lists {
                data = front
            }
        }
        if (totalPoints in 1..14) {
            val groupedMappedFrontenderList = props.questions.groupBy { it.type }.map {
                Triple(it.key, it.value[0].priority, it.value.map { it.points }.sum())
            }
            val certainFrontenderType = groupedMappedFrontenderList.filter {
                it.third == groupedMappedFrontenderList.maxBy { it.third }.third
            }.sortedByDescending { it.second }.first().first
            val frontender = frontenderList.first { it.type == certainFrontenderType }
            img {
                css {
                    width = 400.px
                    height = 400.px
                    backgroundSize = BackgroundSize.cover
                }
                src = frontender.img
            }
            Lists {
                data = frontender
            }
        }
    }
}