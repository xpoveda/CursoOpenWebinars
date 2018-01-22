package com.openwebinars.mydatabase.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

@RealmClass
class CarModel(@PrimaryKey var id: String = "", var brand: String = "") : RealmObject()

