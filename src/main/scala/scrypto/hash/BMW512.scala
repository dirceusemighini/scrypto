package scrypto.hash

object BMW512 extends FRHash64 {
  override protected def hf: fr.cryptohash.Digest = new fr.cryptohash.BMW512
}