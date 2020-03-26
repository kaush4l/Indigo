import React, { Component } from 'react'
import { Header } from './Components/Header'
import Footer from './Components/Footer'
//import logo from './logo.svg';
import './App.css'

class App extends Component {
  render() {
    return (
      <div>
        <div className='App-header'>
          <Header />
        </div>
        <div className='App-footer'>
          <Footer />
        </div>
      </div>
    )
  }
}

export default App
