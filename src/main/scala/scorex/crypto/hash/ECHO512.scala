package scorex.crypto.hash

object ECHO512 extends FRHash64 {
  override protected def hf: fr.cryptohash.Digest = new fr.cryptohash.ECHO512
}