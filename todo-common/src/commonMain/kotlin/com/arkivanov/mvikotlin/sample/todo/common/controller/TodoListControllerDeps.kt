package com.arkivanov.mvikotlin.sample.todo.common.controller

import com.arkivanov.mvikotlin.core.instancekeeper.InstanceKeeperProvider
import com.arkivanov.mvikotlin.core.lifecycle.Lifecycle
import com.arkivanov.mvikotlin.core.store.StoreFactory
import com.arkivanov.mvikotlin.sample.todo.common.database.TodoDatabase

class TodoListControllerDeps(
    override val storeFactory: StoreFactory,
    override val database: TodoDatabase,
    override val lifecycle: Lifecycle,
    override val instanceKeeperProvider: InstanceKeeperProvider,
    override val listOutput: (TodoListController.Output) -> Unit
) : TodoListController.Dependencies
