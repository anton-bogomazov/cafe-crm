package com.comname.cafecrm

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.transaction.annotation.Transactional

@SpringBootTest
@Transactional
abstract class BaseServiceTest : BaseTest()