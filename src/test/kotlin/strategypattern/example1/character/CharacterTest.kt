package strategypattern.example1.character

import com.develoberke.strategypattern.example1.character.Knight
import com.develoberke.strategypattern.example1.weapon.AxeBehaviour
import com.develoberke.strategypattern.example1.weapon.SwordBehaviour
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

@ExtendWith()
class CharacterTest {

    @Test
    fun `it should fight with the weapon`() {
        // given
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        System.setOut(PrintStream(outputStream))

        val swordBehaviour = SwordBehaviour()
        val knight = Knight(swordBehaviour)

        // when
        knight.fight()

        // then
        val result = outputStream.toString().trim()
        assertEquals(result, "Knight is fighting\r\nSwinging a sword")

        System.setOut(originalOut)
    }

    @Test
    fun `it should change the weapon and fight with the new weapon`() {
        // given
        val outputStream = ByteArrayOutputStream()
        val originalOut = System.out
        System.setOut(PrintStream(outputStream))

        val swordBehaviour = SwordBehaviour()
        val axeBehaviour = AxeBehaviour()
        val knight = Knight(swordBehaviour)

        // when
        knight.setWeapon(axeBehaviour)
        knight.fight()

        // then
        val result = outputStream.toString().trim()
        assertEquals(result, "Knight is fighting\r\nChopping with an axe")

        System.setOut(originalOut)
    }
}
