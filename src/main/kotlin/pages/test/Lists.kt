import csstype.*
import react.FC
import react.Props
import react.css.css
import react.dom.html.ReactHTML

external interface ListsProps: Props {
    var data: Frontender
}

val Lists = FC<ListsProps> { props ->
    ReactHTML.div {
        css {
            marginLeft = 30.px
            width = 40.vh
        }
        ReactHTML.div {
            css {
                fontFamily = FontFamily.sansSerif
                fontWeight = FontWeight.normal
                fontSize = 28.px
            }
            +"Skills"
        }
        for (skill in props.data.skills) {
            ReactHTML.div {
                css {
                    fontFamily = FontFamily.sansSerif
                    fontWeight = FontWeight.normal
                    fontSize = 16.px
                }
                +"- $skill"
            }
        }
        ReactHTML.div {
            css {
                height = 20.px
            }
        }
        ReactHTML.div {
            css {
                fontFamily = FontFamily.sansSerif
                fontWeight = FontWeight.normal
                fontSize = 28.px
            }
            +"Debuff"
        }
        for (deb in props.data.debuff) {
            ReactHTML.div {
                css {
                    width = 350.px
                    fontFamily = FontFamily.sansSerif
                    fontWeight = FontWeight.normal
                    fontSize = 16.px
                }
                +"- $deb"
            }
        }
    }
}