package scorex.crypto.hash

object Fugue512 extends FRHash64 {
  override protected def hf: fr.cryptohash.Digest = new fr.cryptohash.Fugue512
}